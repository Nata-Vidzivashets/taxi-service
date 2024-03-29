package taxi.model;

import java.util.Objects;

public class Driver {
    private Long id;
    private String name;
    private String login;
    private String password;
    private String licenseNumber;

    public Driver() {
    }

    public Driver(String name, String login, String licenseNumber) {
        this.name = name;
        this.login = login;
        this.licenseNumber = licenseNumber;
    }

    public Driver(String name, String login, String password, String licenseNumber) {
        this(name, login, licenseNumber);
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id)
                && Objects.equals(name, driver.name)
                && Objects.equals(login, driver.login)
                && Objects.equals(password, driver.password)
                && Objects.equals(licenseNumber, driver.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, password, licenseNumber);
    }

    @Override
    public String toString() {
        return "Driver{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", login='" + login + '\''
                + ", licenseNumber='" + licenseNumber + '\''
                + '}';
    }
}
