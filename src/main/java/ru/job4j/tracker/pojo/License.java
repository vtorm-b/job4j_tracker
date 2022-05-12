package ru.job4j.tracker.pojo;

import java.util.Date;
import java.util.Objects;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date created;

    public License() {
        /*this.owner = onwer;
        this.model = model;
        this.code = code;
        this.created = created;*/
    }

    public String getOwner() {
        return owner;
    }

    public String getModel() {
        return model;
    }

    public String getCode() {
        return code;
    }

    public Date getCreated() {
        return created;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code);
    }

    @Override
    public boolean equals(Object o) {
        License license = (License) o;
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            return Objects.equals(owner, license.owner)
                    && Objects.equals(model, license.model)
                    && Objects.equals(code, license.code)
                    && Objects.equals(created, license.created);
        }
    }









