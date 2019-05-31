package ru.parhomych.di.constructorinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LearningGroup {

    private List<People> peopleList;
    private Set<String> subjects;
    private Map<String, People> rolesInGroup;

    public LearningGroup(List<People> peopleList, Set<String> subjects, Map<String, People> rolesInGroup) {
        System.out.println("LearningGroup.LearningGroup <- конструктор");
        this.peopleList = peopleList;
        this.subjects = subjects;
        this.rolesInGroup = rolesInGroup;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------------\n");
        stringBuilder.append("Ваша группа, сделанная с помощью Constructor Injection (List)\n");
        for (People people:
                peopleList) {
            stringBuilder.append(people);
            stringBuilder.append("\n");
        }
        stringBuilder.append("Предметы этой группы, Constructor Injection (Set):\n");

        for (String subject:
                subjects) {
            stringBuilder.append(subject);
            stringBuilder.append("\n");
        }

        stringBuilder.append("Роли в группе, Constructor Injection (Map): + \n");
        stringBuilder.append("Двоечник: " + rolesInGroup.get("Двоечник") + "\n");
        stringBuilder.append("Староста: " + rolesInGroup.get("Староста") + "\n");

        stringBuilder.append("--------------------");
        return stringBuilder.toString();
    }
}
