package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Джекичан", dateFormat.parse("JUNE 1 2012"));
        map.put("Щварцнеггер", dateFormat.parse("JULY 1 2012"));
        map.put("Стетхем", dateFormat.parse("AUGUST 1 2012"));
        map.put("Питт", dateFormat.parse("JANUARY 1 2012"));
        map.put("Депп", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Макконахи", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Харди", dateFormat.parse("DECEMBER 1 2012"));
        map.put("ДиКаприо", dateFormat.parse("MAY 1 2012"));
        map.put("Ривз", dateFormat.parse("MAY 1 2012"));
        return map;

    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<String, Date> entry = iterator.next();
            if(entry.getValue().getMonth()==5||entry.getValue().getMonth()==6||entry.getValue().getMonth()==7)
                iterator.remove();
        }

    }

    public static void main(String[] args) {

    }
}
