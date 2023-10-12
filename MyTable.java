public class MyTable {
    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }


    public String get(char c) {
        if (c < 'a' || c > 'z') {
            return null; // out of bounds
        }
        int index = c - 'a';
        return (entries[index] != null) ? entries[index].str : null;
    }


    public void add(char c, String s) {
        if (c < 'a' || c > 'z') {
            return; // out of bounds
        }
        int index = c - 'a';
        entries[index] = new Entry(c, s);
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry.toString()).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        // returns a String of the form "ch->str"
        public String toString() {
            return ch + "->" + str;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t.get('a'));
        System.out.println(t.get('b'));
        System.out.println(t.get('w'));
    }
}








