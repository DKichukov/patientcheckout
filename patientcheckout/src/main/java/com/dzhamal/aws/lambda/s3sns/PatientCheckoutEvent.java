package com.dzhamal.aws.lambda.s3sns;

public class PatientCheckoutEvent {

    private String fistName;
    private String middleName;
    private String LastName;
    private String ssn;

    public PatientCheckoutEvent() {
    }

    public PatientCheckoutEvent(String fistName, String middleName, String lastName, String ssn) {
        this.fistName = fistName;
        this.middleName = middleName;
        LastName = lastName;
        this.ssn = ssn;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "PatientCheckoutEvent{" +
            "fistName='" + fistName + '\'' +
            ", middleName='" + middleName + '\'' +
            ", LastName='" + LastName + '\'' +
            ", ssn='" + ssn + '\'' +
            '}';
    }
}
