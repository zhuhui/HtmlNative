package com.mozz.htmlnative.dom;

/**
 * @author Yang Tao, 17/3/21.
 */

public class HNHead {
    private Metas mMeta;
    private String mTitle;

    public boolean containsMeta(Meta key) {
        lazyInitialMetaData();
        return mMeta.contains(key);
    }

    public Meta getMeta(String metaName) {
        lazyInitialMetaData();
        return mMeta.get(metaName);
    }

    public void clearMeta() {
        if (mMeta != null) {
            mMeta.clear();
        }
    }

    public Meta putMeta(Meta value) {
        lazyInitialMetaData();
        return mMeta.put(value);
    }

    public Meta removeMeta(Meta key) {
        lazyInitialMetaData();
        return mMeta.remove(key);
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    private void lazyInitialMetaData() {
        if (mMeta == null) {
            mMeta = new Metas();
        }
    }

    @Override
    public String toString() {
        String metaStr = "";
        if (mMeta != null) {
            metaStr = mMeta.toString();
        }
        return "[HNHead: title=" + mTitle + ", meta=" + metaStr + "]";
    }
}
