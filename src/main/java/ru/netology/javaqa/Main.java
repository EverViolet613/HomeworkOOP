package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        System.out.println("имя:" + post.name);
        System.out.println("отчество:" + post.patronymic);
        System.out.println("фамилия:" + post.surname);
        System.out.println("паспорт:" + post.passport);
        System.out.println("телефон:" + post.phone);
        System.out.println("подписка:" + post.subscription);
        System.out.println("дата рождения:" + post.birthday.day + "/" + post.birthday.month + "/" + post.birthday.year);        ;
    }
}