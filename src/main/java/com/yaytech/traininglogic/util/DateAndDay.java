package com.yaytech.traininglogic.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateAndDay {

    LocalDate localeDate = LocalDate.now();

    public int getMountValue(){
        return localeDate.getMonthValue();
    }

    public int getDayValue(){
        return localeDate.getDayOfMonth();
    }
}
