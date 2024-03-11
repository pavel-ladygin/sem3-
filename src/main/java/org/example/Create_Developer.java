package org.example;

class Create_Developer {
    public static Developer createDeveloper(String name, String level, double experience, String technologies, String type) {
        if (type.equalsIgnoreCase("Java")) {
            return new JavaDeveloper(name, level, experience, technologies);
        } else if (type.equalsIgnoreCase("Python")) {
            return new PythonDeveloper(name, level, experience, technologies);
        } else {
            return null;
        }
    }
}
