package com.example.reidsspringboot.gof23.command;
/**
 * The triangle is the most balanced
 */

public class StopCommand implements Command {
    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }

}