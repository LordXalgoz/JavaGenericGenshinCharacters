package com.company;

public class Main {

    public static void main(String[] args) {
        MyCollection<GenshinCharacter> myCollection = new MyCollection<>(GenshinCharacter.class);
        myCollection.addToEnd(new GenshinCharacter("Дилюк", "Мужской", "Пиро", "Архаичный меч", "Мондштадт"));
        myCollection.addToEnd(new GenshinCharacter("Сяо", "Мужской", "Анемо", "Нефритовый Коршун", "Ли Юэ"));
        myCollection.addToEnd(new GenshinCharacter("Казуха", "Мужской", "Анемо", "Клятва свободы", "Иназума"));
        myCollection.addToEnd(new GenshinCharacter("Беннет", "Мужской", "Пиро", "Осквернённое желание", "Мондштадт"));

        for (GenshinCharacter item: myCollection) {
            System.out.println(item.toString()  );
        }
    }
}
