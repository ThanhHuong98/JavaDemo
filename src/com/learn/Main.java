package com.learn;
//Bài 12. Nhập họ tên của một người từ bàn phím. Hãy chuẩn hóa xâu họ tên này.
//        (Xóa các khoảng trắng thừa và ký tự đầu tiên của họ, chữ lót và tên phải viết hoa, các ký tự còn lại viết thường).
//        Ví dụ: Nhập:       “ NgUyen    VaN  A  “ Xuất:        “Nguyen Van A”

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Input String: ");
//        Scanner reader = new Scanner(System.in);
//        String str = reader.nextLine();
        String str = "    Nguyen     vAn     quaN   7826   ";
        System.out.println("The Raw String: " +str );
        str = standardizedString(str);
        System.out.println("The Standardized String: " + str );

    }


    private static String standardizedString(String str) {
        String newStr = "";

        str = str.trim();
        str = str.replaceAll("\\s+", " ").toLowerCase();

        String temp[] = str.split(" ");
        for(int i = 0; i < temp.length; i ++){
            String s = temp[i];
            s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
            newStr += s + " ";
        }

        return newStr ;
    }


}
