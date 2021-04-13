public class Proov5_kodutoo {
    public static void kuvaOlek(Voolujuht v) {
        if(v.kasJuhib()) {
			System.out.println("Juhib");
		} else {
			System.out.println("Ei juhi");
		}
	}	
	public static void main(String[] arg) {
        Lyliti a = new Lyliti();
        Lyliti b = new Lyliti();
        Lyliti c = new Lyliti();
        Lyliti d = new Lyliti();
        Lyliti e = new Lyliti();
        Lyliti f = new Lyliti();
        Lyliti g = new Lyliti();
        Lyliti h = new Lyliti();
        Lyliti i = new Lyliti();
        Lyliti j = new Lyliti();

        Jadayhendus j1 = new Jadayhendus();
        Jadayhendus j2 = new Jadayhendus();
        Jadayhendus j3 = new Jadayhendus();
        Jadayhendus j4 = new Jadayhendus();
        Jadayhendus j5 = new Jadayhendus();

        Roopyhendus r1 = new Roopyhendus();
        Roopyhendus r2 = new Roopyhendus();
        Roopyhendus r3 = new Roopyhendus();
        Roopyhendus r4 = new Roopyhendus();

        r1.lisa(i);
        r1.lisa(j);
        j1.lisa(b);
        j1.lisa(r1);
        j2.lisa(g);
        j2.lisa(h);
        r2.lisa(f);
        r2.lisa(j2);
        j3.lisa(e);
        j3.lisa(r2);
        r3.lisa(d);
        r3.lisa(j3);
        j4.lisa(c);
        j4.lisa(r3);
        r4.lisa(j1);
        r4.lisa(j3);
        j5.lisa(a);
        j5.lisa(r4);

        a.seisund(true);
        b.seisund(true);
        i.seisund(true);
        kuvaOlek(j5);
        a.seisund(false);
        b.seisund(false);
        i.seisund(false);

        a.seisund(true);
        c.seisund(true);
        e.seisund(true);
        g.seisund(true);
        h.seisund(true);
        kuvaOlek(j5);
        a.seisund(false);
        c.seisund(false);
        e.seisund(false);
        g.seisund(false);
        h.seisund(false);

        a.seisund(true);
        c.seisund(true);
        e.seisund(true);
        g.seisund(true);
        kuvaOlek(j5);
    }
}