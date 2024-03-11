package org.example;

public class PythonDeveloper extends Developer{
    public PythonDeveloper(String name, String level, Double experience, String technologies) {
        super(name, level, experience, technologies);
    }

    @Override
    void Develop() {
        System.out.println("Python-разработчик пишет код");
        System.out.println("Имя разрабочика: " + name);
        System.out.println("Уровень разрабочика" + level);
        System.out.println("Опыт работы: " + experience);
    }
}
