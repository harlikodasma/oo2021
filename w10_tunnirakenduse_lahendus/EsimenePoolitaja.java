public class EsimenePoolitaja implements FunktsiooniLiides<String, String> {
    public String arvuta(String sisend) {
        int keskkoht = sisend.length() / 2;
        return sisend.substring(0, keskkoht);
    }
}