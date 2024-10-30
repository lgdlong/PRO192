package source_code;

import interfaces.I_Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date implements I_Date{
    public LocalDate getDate(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
        
        /**
         * isBefore(), isAfter(), or isEqual() to compare LocalDate
         * 
         * plusDays(), minusDays(), plusMonths() to change Date
         * 
         * isLeapYear() : năm nhuận
         */

        return LocalDate.parse(dob, formatter);
    }
    
    
}
