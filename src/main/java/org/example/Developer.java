package org.example;

public abstract class Developer {
    public String name;
    public String level;
    public Double experience;
    public String technologies;

    public Developer(String name, String level, Double experience, String technologies) {
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.technologies = technologies;
    }
    abstract  void Develop();
}
