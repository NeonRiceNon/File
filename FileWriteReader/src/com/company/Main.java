package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Writer.writeInBeginOfFirst("C:\\Users\\user\\Desktop\\fool.txt", "C:\\Users\\user\\Desktop\\fuul.txt"); //ЧИТАЕТ СТРОКУ ИЗ ФАЙЛА FUUL И ПЕРЕНОСИТ В ФАЙЛ FOOL
    }
}