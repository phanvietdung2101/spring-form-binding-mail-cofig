package com.yez.model;

public class MailConfig {
    private String languages;
    private Long pageSize;
    private boolean spamFilter;
    private String signature;

    public MailConfig() {
    }

    public MailConfig(String languages, Long pageSize, boolean spamFilter, String signature) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.spamFilter = spamFilter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isSpamFilter() {
        return spamFilter;
    }

    public void setSpamFilter(boolean spamFilter) {
        this.spamFilter = spamFilter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
