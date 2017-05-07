package ru.tusur.gpo.data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.sql.Blob;

/**
 * Created by maxim on 07.05.17.
 */
@Entity
public class LanguageSkills {
    @EmbeddedId
    private LanguageSkillsID languageSkillsID;

    private long numberOfConfirmingDocument;
    private Blob copyOfConfirmingDocument;

    public LanguageSkills ()    {}
    public LanguageSkills (long numberOfConfirmingDocument, Blob copyOfConfirmingDocument)  {
        this.numberOfConfirmingDocument = numberOfConfirmingDocument;
        this.copyOfConfirmingDocument = copyOfConfirmingDocument;
    }

    public LanguageSkillsID getLanguageSkillsID() {
        return languageSkillsID;
    }

    public void setLanguageSkillsID(LanguageSkillsID languageSkillsID) {
        this.languageSkillsID = languageSkillsID;
    }

    public long getNumberOfConfirmingDocument() {
        return numberOfConfirmingDocument;
    }

    public void setNumberOfConfirmingDocument(long numberOfConfirmingDocument) {
        this.numberOfConfirmingDocument = numberOfConfirmingDocument;
    }

    public Blob getCopyOfConfirmingDocument() {
        return copyOfConfirmingDocument;
    }

    public void setCopyOfConfirmingDocument(Blob copyOfConfirmingDocument) {
        this.copyOfConfirmingDocument = copyOfConfirmingDocument;
    }
}
