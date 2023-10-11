package com.example.utils;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService{
    private Scanner scanner;

    @Autowired
    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        System.out.print("Enter your input: ");
        return scanner.nextLine();
    }

    @Override
    public int getInt() {
        return 0;
    }
}
