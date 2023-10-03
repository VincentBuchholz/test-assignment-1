package two.katas.numeral;


public class NumeralConverter {
    public String convert(long number) {
        StringBuilder roman = new StringBuilder();

        if(number < 1){
            throw new IllegalArgumentException("Number must be over 0");
        }

        while(number > 0){
            if(number >= 1000){
                roman.append("M");
                number-=1000;
            }else if(number >= 900){
                roman.append("CM");
                number-=900;
            } else if(number >= 500) {
                roman.append("D");
                number -= 500;
            }else if(number >= 400){
                roman.append("CD");
                number-=400;
            } else if(number >= 100) {
                roman.append("C");
                number -= 100;
            }else if(number >= 90){
                roman.append("XC");
                number-=90;
            }else if(number >= 50){
                roman.append("L");
                number-=50;
            } else if (number >= 10) {
                roman.append("X");
                number-=10;
            } else if (number >= 9) {
                roman.append("IX");
                number-=9;
            } else if (number >= 8) {
                roman.append("VIII");
                number-=8;
            } else if (number >= 7) {
                roman.append("VII");
                number-=7;
            } else if (number >= 6) {
                roman.append("VI");
                number-=6;
            } else if (number >= 5) {
                roman.append("V");
                number-=5;
            } else if (number >= 4) {
                roman.append("IV");
                number-=4;
            } else if (number >= 3) {
                roman.append("III");
                number-=3;
            }else if (number >= 2) {
                roman.append("II");
                number-=2;
            }else if (number >= 1) {
                roman.append("I");
                number-=1;
            }
        }

        return roman.toString();
    }

    public int convertFromRoman(String roman){
        int arabic = 0;
        char[] romanArray = roman.toCharArray();
        for(int i = 0; i < romanArray.length; i++){
            if(romanArray[i] == 'M'){
                arabic+=1000;
            } else if(romanArray[i] == 'D'){
                arabic+=500;
            } else if(romanArray[i] == 'C'){
                arabic+=100;
            } else if(romanArray[i] == 'L'){
                arabic+=50;
            } else if(romanArray[i] == 'X'){
                arabic+=10;
            } else if(romanArray[i] == 'V'){
                arabic+=5;
            } else if(romanArray[i] == 'I'){
                arabic+=1;
            } else {
                throw new IllegalArgumentException("Invalid Roman Number");
            }
        }

        return arabic;
    }
}

