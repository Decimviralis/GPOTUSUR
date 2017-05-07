package ru.tusur.gpo.data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by maxim on 07.05.17.
 */
@Embeddable
public class LanguageSkillsID implements Serializable {
    @ManyToOne
    @JoinColumn(name = "employee_id")
    protected Employee employee;
    protected String language;
    protected String levelOfKnowledge;

    public LanguageSkillsID () {}

    public LanguageSkillsID (Employee employee, String language, String levelOfKnowledge)   {
        this.employee = employee;
        this.language = language;
        this.levelOfKnowledge = levelOfKnowledge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LanguageSkillsID that = (LanguageSkillsID) o;

        if (!employee.equals(that.employee)) return false;
        if (!language.equals(that.language)) return false;
        return levelOfKnowledge.equals(that.levelOfKnowledge);
    }

    @Override
    public int hashCode() {
        int result = employee.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + levelOfKnowledge.hashCode();
        return result;
    }
}
