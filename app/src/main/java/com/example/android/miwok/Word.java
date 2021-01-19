package com.example.android.miwok;

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    /** Default translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    /** Icon for the word*/
    private int wordImageId = NO_IMAGE_PROVIDED;

    private int audioFileId = -1;

    public Word(String miwok, String english, int wordImageId, int audioFileId){
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = english;
        this.wordImageId = wordImageId;
        this.audioFileId = audioFileId;
    }

    public Word(String miwok, String english, int audioFileId){
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = english;
        this.audioFileId = audioFileId;
    }

    /**
     *
     * @return Default Translation
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     *
     * @return Miwok Translation
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getAudioFileId() {
        return audioFileId;
    }

    /**
     *
     * @return Image Id
     */
    public int getWordImageId() {
        return wordImageId;
    }

    public boolean hasImage(){
        return this.wordImageId != NO_IMAGE_PROVIDED;
    }

    public boolean hasAudio(){
        return this.audioFileId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", wordImageId=" + wordImageId +
                ", audioFileId=" + audioFileId +
                '}';
    }
}
