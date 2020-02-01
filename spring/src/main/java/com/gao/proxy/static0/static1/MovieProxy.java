package com.gao.proxy.static0.static1;

/**
 * ​
 *
 * @author grow
 * ​
 * @version v1.0
 * ​
 * @description ​
 * @date 2019-11-08 16:39
 * ​
 **/
public class MovieProxy implements Movie {
    private WatchMovie watchMovie;

    public MovieProxy(WatchMovie watchMovie) {
        super();
        this.watchMovie = watchMovie;
    }

    public void play() {
        advertising(true);
        watchMovie.play();
        advertising(false);
    }
    public void advertising(boolean isStart){
        if(isStart){
            System.out.println("电影马上开始了");
        }else {
            System.out.println("电影结束了");
        }
    }

    public static void main(String[] args) {
        WatchMovie movie = new WatchMovie();
        MovieProxy proxy1 = new MovieProxy(movie);
        proxy1.play();
    }

}
