package chapter07;

class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 0;

    public void setVolume(int volume){
        if(volume < MIN_VOLUME || volume > MAX_VOLUME)
            return;
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }

    public void setChannel(int channel){
        if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
            return;
        this.channel = channel;
    }

    public int getChannel(){
        return channel;
    }

}

class Ex_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }
}
