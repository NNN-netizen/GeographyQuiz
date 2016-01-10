package com.example.geographyquiz;

/**
 * Created by AL_META on 12/25/2015.
 */
public class LeQuestion {

    private int mTextResId;
    private boolean mAnswerTrue;

    public LeQuestion(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
