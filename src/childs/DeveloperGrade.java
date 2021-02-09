package childs;


public enum DeveloperGrade {
    JUNIOR("I am junior developer"),
    MIDDLE("I am middle developer"),
    SENIOR("I am senior developer"),
    TEAMLEAD("I am teamlead of company");

    private String phrase;

    DeveloperGrade(String phrase) {
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String printPhrase() {
        System.out.println("I am working for IT company and I like my job");
        return phrase;
    }
}
