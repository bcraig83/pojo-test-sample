package b3ls;

public class MyPojo {
    private String firstName = "";
    private int age = 0;
    private long id = 0;
    private String surname = "";

    @Override
    public String toString() {
        return "MyPojo{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPojo)) return false;

        MyPojo myPojo = (MyPojo) o;

        if (getAge() != myPojo.getAge()) return false;
        if (getId() != myPojo.getId()) return false;
        if (getFirstName() != null ? !getFirstName().equals(myPojo.getFirstName()) : myPojo.getFirstName() != null)
            return false;
        return getSurname() != null ? getSurname().equals(myPojo.getSurname()) : myPojo.getSurname() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getSurname().hashCode();
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
