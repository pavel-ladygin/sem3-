package org.example;

public class JavaDeveloper extends Developer{
    public JavaDeveloper(String name, String level, Double experience, String technologies) {
        super(name, level, experience, technologies);
    }

    @Override
    void Develop() {
      System.out.println("Java-разработчик пишет код");
      System.out.println("Технологии, используемые разработчиком: " + technologies);
    }


}
