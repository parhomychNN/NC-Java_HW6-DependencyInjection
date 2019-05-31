package ru.parhomych.di.setterinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LearningGroup {
    private List<People> peopleList;
    private Set<String> subjects;
    private Map<String, People> rolesInGroup;

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    public Map<String, People> getRolesInGroup() {
        return rolesInGroup;
    }

    public void setRolesInGroup(Map<String, People> rolesInGroup) {
        this.rolesInGroup = rolesInGroup;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--------------------\n");
        stringBuilder.append("Ваша группа, сделанная с помощью Setter Injection (List)\n");
        for (People people:
                peopleList) {
            stringBuilder.append(people);
            stringBuilder.append("\n");
        }
        stringBuilder.append("Предметы этой группы, Setter Injection (Set):\n");

        for (String subject:
                subjects) {
            stringBuilder.append(subject);
            stringBuilder.append("\n");
        }

        stringBuilder.append("Роли в группе, Setter Injection (Map): \n");
        stringBuilder.append("Двоечник: " + rolesInGroup.get("Двоечник") + "\n");
        stringBuilder.append("Староста: " + rolesInGroup.get("Староста") + "\n");

        stringBuilder.append("--------------------");
        return stringBuilder.toString();
    }
}