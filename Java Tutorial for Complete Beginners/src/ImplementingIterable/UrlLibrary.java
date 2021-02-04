package ImplementingIterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.function.Consumer;

public class UrlLibrary implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();

    private class UrlIterator implements Iterator<String>{
        private int index = 0;

        public boolean hasNext() {
            return index < urls.size();
        }

        public String next() {
            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urls.get(index));
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = br.readLine();
                while( line != null){
                    sb.append(line);
                    sb.append("\n");
                    line = br.readLine();
                }
                br.close();
            }catch(IOException e){
                e.printStackTrace();
            }

            index++;
            return sb.toString();
        }

        public void remove() {
            urls.remove(index);
        }

        public void forEachRemaining(Consumer<? super String> action) {

        }
    }

    public UrlLibrary(){
        urls.add("https://google.com");
        urls.add("https://facebook.com");
        urls.add("https://bbc.com");
    }

    /*
    public Iterator<String> iterator() {
        return urls.iterator();
    }
     */

    public Iterator<String> iterator() {
        return new UrlIterator();
    }
}
