package org.iesfm.library;

import java.util.Objects;

public class Member {
    private int numMember;
    private String nif;
    private String name;
    private String surname;
    private int cp;

    public Member(int numMember, String nif, String name, String surname, int cp) {
        this.numMember = numMember;
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.cp = cp;
    }

    public int getNumMember() {
        return numMember;
    }

    public void setNumMember(int numMember) {
        this.numMember = numMember;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return numMember == member.numMember && cp == member.cp && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(surname, member.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numMember, nif, name, surname, cp);
    }
}
