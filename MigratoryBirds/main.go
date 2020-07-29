//Problem at https://www.hackerrank.com/challenges/migratory-birds/problem

package main

import (
    "bufio"
    "fmt"
    "io"
    "os"
    "strconv"
    "strings"
)

// Complete the migratoryBirds function below.
func migratoryBirds(arr []int32) int32 {
    value := [5]int32{0, 0, 0, 0, 0}
    for i:=0; i<len(arr); i++{
        switch arr[i] {
        case 1:
            value[0]+=1
        case 2:
            value[1]+=1
        case 3:
            value[2]+=1
        case 4:
            value[3]+=1
        case 5:
            value[4]+=1
        }
    }
    fmt.Println(value)
    res:= int32(0)
    for i:=int32(0); i<int32(len(value))-1; i++ {
        res= Compare(value[res], value[i+1], res, i+1)
        fmt.Println(res)
    }
    return res+1
}

//return index of the bigger value
func Compare(a, b, i, ii int32) int32 {
    res:=ii
    if a >= b {
        res=i
    }
    return res
}

func main() {
    reader := bufio.NewReaderSize(os.Stdin, 16 * 1024 * 1024)

    stdout, err := os.Create(os.Getenv("OUTPUT_PATH"))
    checkError(err)

    defer stdout.Close()

    writer := bufio.NewWriterSize(stdout, 16 * 1024 * 1024)

    arrCount, err := strconv.ParseInt(strings.TrimSpace(readLine(reader)), 10, 64)
    checkError(err)

    arrTemp := strings.Split(strings.TrimSpace(readLine(reader)), " ")

    var arr []int32

    for i := 0; i < int(arrCount); i++ {
        arrItemTemp, err := strconv.ParseInt(arrTemp[i], 10, 64)
        checkError(err)
        arrItem := int32(arrItemTemp)
        arr = append(arr, arrItem)
    }

    result := migratoryBirds(arr)

    fmt.Fprintf(writer, "%d\n", result)

    writer.Flush()
}

func readLine(reader *bufio.Reader) string {
    str, _, err := reader.ReadLine()
    if err == io.EOF {
        return ""
    }

    return strings.TrimRight(string(str), "\r\n")
}

func checkError(err error) {
    if err != nil {
        panic(err)
    }
}

