package org.launchcode.javawebdevtechjobspersistent.models;

import org.aspectj.weaver.ArrayReferenceType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private final List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> skills) {
        super();
        this.employer = anEmployer;
        this.skills.addAll(skills);
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public void setSkills(List<Skill> skills){
        this.skills.clear();
        this.skills.addAll(skills);
    }
}
