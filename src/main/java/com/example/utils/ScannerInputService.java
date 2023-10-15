package com.example.utils;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{
    Scanner scanner;

    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return scanner.nextInt();
    }
}