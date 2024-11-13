package com.ghelections;

import java.time.LocalDate;

public class Main{

    public static void main(String[] args) {
        //Person test
        Person p1 = new Person();
        p1.setName("Michael Ofori");
        p1.setGender('M');
        p1.setDateOfBirth(LocalDate.of(1999,4,2));
        Person p2 = new Person("Elijah Boateng", LocalDate.of(2001,10,24),'M');
        Person p3 = new Person("Rita Segbaya", LocalDate.of(1992,11,3),'F');

        //Voter test
        Voter v1 = new Voter(p1, "Afiduase", 7501347);
        Voter v2 = new Voter(p2, "Adidzome", 1101501);
        Voter v3 = new Voter(p3, "Walewale", 290600);
        Voter v4 = new Voter("Vida Anim", LocalDate.of(1988,12,3),'F', "Atebubu", 9185477);
        Voter v5 = new Voter("John Dumelo", LocalDate.of(1989,5,24),'M',"Ho",8152245);
        Voter v6 = new Voter("Aka Ebenezer", LocalDate.of(1978,8,12),'M',"Akim Tafo",2124879);
        Voter v7 = new Voter("Mumuni Salamatu", LocalDate.of(1995,4,16),'F', "Navrongo",87138517);
        Voter v8 = new Voter("David Ebo Adjepon-Yamoah", LocalDate.of(1976,11,27), 'M', "Koforidua", 5967452);
        Voter v9 = new Voter("Elvis Okoh", LocalDate.of(1901,7,17), 'M', "Obuasi", 2548963);
        Voter v10 = new Voter("Miriam Duke", LocalDate.of(2002,1,29), 'F',"Cape Coast", 98991521);
        Voter v11 = new Voter("Aisha Nuhu", LocalDate.of(1969,9,3), 'F', "Mumpurugi Yoyo",54712132);
        Voter v12 = new Voter("Naa Ayi-Mensah", LocalDate.of(1998,3,7), 'F', "Korobite",54584472);
        Voter v13= new Voter("Joesph Mensah", LocalDate.of(1963,10,23), 'M', "Odumasi",23752132);
        Voter v14 = new Voter("Justice Katako", LocalDate.of(1949,9,3), 'M', "Akatsi",23657332);
        Voter v15 = new Voter("Christelle Asantewaa McCarthy", LocalDate.of(2001,12,24), 'F', "Mamprobi",11214223);
/*
        System.out.println(v1.toString()+"\n");
        System.out.println(v2.toString()+"\n");
        System.out.println(v3.toString()+"\n");
        System.out.println(v4.toString()+"\n");
        System.out.println(v5.toString()+"\n");
        System.out.println(v6.toString()+"\n");
        System.out.println(v7.toString()+"\n");
        System.out.println(v8.toString()+"\n");
        System.out.println(v10.toString()+"\n");
        System.out.println(v11.toString()+"\n");
        System.out.println(v12.toString()+"\n");
        System.out.println(v13.toString()+"\n");
        System.out.println(v14.toString()+"\n");
        System.out.println(v15.toString()+"\n");*/

        //Polling stations test
        PollingStation ps1 = new PollingStation("St.Martin's School");
        ps1.addVoter(v1);
        ps1.addVoter(v2);
        ps1.addVoter(v3);
        v1.castVote(1);
        v2.castVote(1);
        v3.castVote(2);
        PollingStation ps2 = new PollingStation("North Kaneshie Point 4");
        ps2.addVoter(v4);
        v4.castVote(1);
        PollingStation ps3 = new PollingStation("Kasoa M/A");
        ps3.addVoter(v5);
        v5.castVote(2);

        //District test
        DistrictCollationCenter ds1 = new DistrictCollationCenter("Ayawoaso West");
        ds1.addPollingStation(ps1);
        DistrictCollationCenter ds2 = new DistrictCollationCenter("Tema East");
        ds2.addPollingStation(ps2);
        DistrictCollationCenter ds3 = new DistrictCollationCenter("Okaikoi South");
        ds3.addPollingStation(ps3);

        Region.GreaterAccra.addDistrict(ds1,ds2,ds3);
        System.out.println(Region.GreaterAccra.Summary());





        //National
        //NationalCollationCenter.addRegion(Region.Oti);
        //System.out.println(NationalCollationCenter.Summary());
        //NationalCollationCenter.Declaration();

    }
}
