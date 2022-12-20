package kpo_task5;


public class Main {
    public static void main(String[] args) {
        RuTubeVideoLoaderProxy ploader = new RuTubeVideoLoaderProxy("video_file_path");

        ploader.load(); // Загружаем видео в первый раз
        ploader.load(); // Пытаемся загрузить видео еще несколько раз
        ploader.load();
        ploader.load();
        ploader.display(); // Отображаем видео
        ploader.display();
        ploader.display();
        ploader.display();
    }
}

