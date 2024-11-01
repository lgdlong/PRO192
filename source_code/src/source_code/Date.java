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
/**
DateTimeFormatter.ofPattern("dd/MM/yyyy");      // 01/12/2024
DateTimeFormatter.ofPattern("dd-MM-yyyy");      // 01-12-2024
DateTimeFormatter.ofPattern("MM/dd/yyyy");      // 12/01/2024
DateTimeFormatter.ofPattern("yyyy-MM-dd");      // 2024-12-01
DateTimeFormatter.ofPattern("yyyy/MM/dd");      // 2024/12/01
DateTimeFormatter.ofPattern("dd MMM yyyy");     // 01 Dec 2024
DateTimeFormatter.ofPattern("dd MMMM yyyy");    // 01 December 2024
DateTimeFormatter.ofPattern("yyyyMMdd");        // 20241201 (no delimiters)
DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy"); // Sunday, 01/12/2024 (day name is ignored by `LocalDate`)
DateTimeFormatter.ofPattern("E, dd MMM yyyy");  // Sun, 01 Dec 2024 (day name is ignored by `LocalDate`)
DateTimeFormatter.ofPattern("yyyy-MM");         // 2024-12 (year and month only)
DateTimeFormatter.ofPattern("yyyy/MM");         // 2024/12 (year and month only)
DateTimeFormatter.ofPattern("MMM yyyy");        // Dec 2024 (month and year only)
DateTimeFormatter.ofPattern("MMMM yyyy");       // December 2024 (month and year only)
DateTimeFormatter.ofPattern("dd MMM");          // 01 Dec (day and month only)
DateTimeFormatter.ofPattern("dd/MM");           // 01/12 (day and month only)
DateTimeFormatter.ofPattern("MMM dd");          // Dec 01 (month and day only)

 */
