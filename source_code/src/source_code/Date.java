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
// Common Day-Month-Year Formats
DateTimeFormatter.ofPattern("dd/MM/yyyy");    // 01/12/2024
DateTimeFormatter.ofPattern("dd-MM-yyyy");    // 01-12-2024
DateTimeFormatter.ofPattern("MM/dd/yyyy");    // 12/01/2024
DateTimeFormatter.ofPattern("yyyy-MM-dd");    // 2024-12-01
DateTimeFormatter.ofPattern("yyyy/MM/dd");    // 2024/12/01
DateTimeFormatter.ofPattern("dd MMM yyyy");   // 01 Dec 2024
DateTimeFormatter.ofPattern("dd MMMM yyyy");  // 01 December 2024
DateTimeFormatter.ofPattern("yyyyMMdd");      // 20241201 (no delimiters)

// Day of Week Included
DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy");  // Sunday, 01/12/2024
DateTimeFormatter.ofPattern("E, dd MMM yyyy");    // Sun, 01 Dec 2024
DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");   // Sunday 01/12/2024
DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy"); // Sun, Dec 01, 2024

// Year and Month Only
DateTimeFormatter.ofPattern("yyyy-MM");      // 2024-12
DateTimeFormatter.ofPattern("yyyy/MM");      // 2024/12
DateTimeFormatter.ofPattern("MMM yyyy");     // Dec 2024
DateTimeFormatter.ofPattern("MMMM yyyy");    // December 2024

// Day and Month Only
DateTimeFormatter.ofPattern("dd MMM");       // 01 Dec
DateTimeFormatter.ofPattern("dd/MM");        // 01/12
DateTimeFormatter.ofPattern("MMM dd");       // Dec 01

// Date and Time (24-hour format)
DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");       // 01/12/2024 14:30
DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");    // 01-12-2024 14:30:00
DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");    // 2024-12-01 14:30:00
DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");// 2024/12/01 14:30:00.123 (with milliseconds)

// Date and Time (12-hour format with AM/PM)
DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");     // 01/12/2024 02:30 PM
DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");  // 01-12-2024 02:30:00 PM
DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");  // 2024-12-01 02:30:00 PM
DateTimeFormatter.ofPattern("hh:mm a, MMM dd yyyy");   // 02:30 PM, Dec 01 2024

// Full Date and Time with Day of Week
DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss");  // Sunday, Dec 01, 2024 14:30:00
DateTimeFormatter.ofPattern("EEE, MMM dd yyyy hh:mm a");     // Sun, Dec 01 2024 02:30 PM

// ISO and Standard Formats
DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");        // 2024-12-01T14:30:00
DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");    // 2024-12-01T14:30:00.123 (ISO format with milliseconds)

// ISO Offset Date and Time
DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");     // 2024-12-01T14:30:00+05:00 (offset with hour and minute)
DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"); // 2024-12-01T14:30:00.123+05:00 (ISO with milliseconds and offset)

// ISO Zoned Date and Time
DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss z");      // 2024-12-01T14:30:00 PST (includes time zone short name)
DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss zzzz");   // 2024-12-01T14:30:00 Pacific Standard Time (full time zone name)

// RFC 1123 Date Time
DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss z");  // Sun, 01 Dec 2024 14:30:00 GMT
 
 */
