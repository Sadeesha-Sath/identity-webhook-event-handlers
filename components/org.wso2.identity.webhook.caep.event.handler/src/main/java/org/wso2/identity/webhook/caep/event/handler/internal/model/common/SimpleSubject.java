package org.wso2.identity.webhook.caep.event.handler.internal.model.common;

public class SimpleSubject extends Subject {

    private SimpleSubject() {
    }

    public static SimpleSubject createEmailSubject(String email) {
        SimpleSubject subject = new SimpleSubject();
        subject.setFormat("email");
        subject.addProperty("email", email);
        return subject;
    }

    public static SimpleSubject createPhoneSubject(String phone_number) {
        SimpleSubject subject = new SimpleSubject();
        subject.setFormat("phone_number");
        subject.addProperty("phone_number", phone_number);
        return subject;
    }

    public static SimpleSubject createAccountSubject(String uri) {
        SimpleSubject subject = new SimpleSubject();
        subject.setFormat("account");
        subject.addProperty("uri", uri);
        return subject;
    }

    public static SimpleSubject createIssSubSubject(String iss, String sub) {
        SimpleSubject subject = new SimpleSubject();
        subject.setFormat("iss_sub");
        subject.addProperty("iss", iss);
        subject.addProperty("sub", sub);
        return subject;
    }

    public static SimpleSubject createOpaqueSubject(String id) {
        SimpleSubject subject = new SimpleSubject();
        subject.setFormat("opaque");
        subject.addProperty("id", id);
        return subject;
    }

    public static SimpleSubject createDIDSubject(String url) {
        SimpleSubject subject = new SimpleSubject();
        subject.setFormat("did");
        subject.addProperty("did", url);
        return subject;
    }

    public static SimpleSubject createURISubject(String uri) {
        SimpleSubject subject = new SimpleSubject();
        subject.setFormat("uri");
        subject.addProperty("uri", uri);
        return subject;
    }


}
