import java.util.ArrayList;
public class Word
{
        private String w;
        private int l;
        
        public Word()
        {
                w = "";
                l = 0;
        }
        public Word(String n)
        {
                w = n;
                l = w.length();
        }
        public Word(Word n)
        {
                w = n.toString();
                l = n.getLength();
        }
        
        public int compareTo(Word o)
        {
                if (o.getLength() < l)
                {
                        for (int i = 0; i < o.getLength(); ++i)
                        {
                                if (w.charAt(i) == o.getWord().charAt(i))
                                        continue;
                                else 
                                        return w.charAt(i) - o.getWord().charAt(i);
                        }
                        return l - o.getLength();
                }
                else
                {
                        for (int i = 0; i < l; ++i)
                        {
                                if (w.charAt(i) == o.getWord().charAt(i))
                                        continue;
                                else 
                                        return w.charAt(i) - o.getWord().charAt(i);
                        }
                        return 0;
                }
        }
        
        // public boolean contains()
        // {
        //         return false;
        // }
        
        public boolean equals(Word o)
        {
                if (l != o.getLength())
                        return false;
                char[] x = this.toCharArray();
                char[] y = o.toCharArray();
                for (int i = 0; i < l; i++)
                {
                        if (x[i] != y[i])
                                return false;
                }
                return true;
        }
        
        public String getWord()
        {
                return w;
        }
        public int getLength()
        {
                return l;
        }
        
        public void replace(String o, String n)
        {
               
        
        }
        
        public void setWord(String s)
        {
                w = s;
                l = s.length();
        }
        public void setWord(Word o)
        {
                w = o.getWord();
                l = o.getLength();
        }
        
        public Word subWord(int x)
        {
                char[] z = w.toCharArray();
                StringBuilder ret = new StringBuilder();
                for (int i = x; i < z.length; i++)
                {
                        ret.append(z[i]);
                }
                return new Word(ret.toString());
        }
        
        public Word subWord(int x, int y)
        {
                char[] z = w.toCharArray();
                StringBuilder ret = new StringBuilder();
                for (int i = x; i < z.length && i < y; i++)
                {
                        ret.append(z[i]);
                }
                return new Word(ret.toString());
        }
        
        public char[] toCharArray()
        {
                char[] ret = new char[l];
                for (int i = 0; i < l; i++)
                {
                        ret[i] =w.charAt(i);
                }
                return ret;
        }

        public String toString()
        {
                return "Word: " + getWord() +"\nLength: " + getLength();
        }
}
