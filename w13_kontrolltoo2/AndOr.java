public class AndOr implements Sisend {
    boolean e1vaartus;
    boolean e2vaartus;
    String elnimi;
    String tyyp;
    Element elem;
    AndOr andor;
    public AndOr(String opTyyp, Element e1, Element e2, String nimi, Object ylem) {
        e1vaartus = e1.vaartus;
        e2vaartus = e2.vaartus;
        elnimi = nimi;
        tyyp = opTyyp;
        if(ylem instanceof Element) {
            elem = (Element)ylem;
        } else if(ylem instanceof AndOr) {
            andor = (AndOr)ylem;
        }
    }
    public AndOr(String opTyyp, Element e1, Element e2, String nimi) {
        e1vaartus = e1.vaartus;
        e2vaartus = e2.vaartus;
        elnimi = nimi;
        tyyp = opTyyp;
    }
    public boolean kysi() {
        if(andor != null) {
            if(andor.tyyp.equals("and")) {
                if(andor.kysi()) {
                    System.out.println("Ülemjadal nimega '" + andor.elnimi + "' on väärtus 'true', liigun edasi...");
                    if(e1vaartus && e2vaartus) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    System.out.println("Ülemjadal nimega '" + andor.elnimi + "' on väärtus 'false'.");
                    return false;
                }
            } else if(andor.tyyp.equals("or")) {
                if(andor.kysi()) {
                    System.out.println("Ülemrööbil nimega '" + andor.elnimi + "' on väärtus 'true', liigun edasi...");
                    if(e1vaartus || e2vaartus) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    System.out.println("Ülemrööbil nimega '" + andor.elnimi + "' on väärtus 'false'.");
                    return false;
                }
            }
        } else if(elem != null) {
            if(elem.tyyp.equals("element")) {
                if(elem.vaartus) {
                    System.out.println("Ülemelemendil on väärtus 'true', liigun edasi...");
                    return true;
                } else {
                    System.out.println("Ülemelemendil on väärtus 'false'.");
                    return false;
                }
            }
        } else if(e1vaartus && e2vaartus) {
            return true;
        } else {
            return false;
        }
        return false;
    }
}