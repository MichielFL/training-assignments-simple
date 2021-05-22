package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {

    public void buildAndSendMail(MailMan m, MailAddress address, MailBody mailBody){

        // Format the message given the content type and raw message
        Mail mail = new Mail(address, mailBody);
        // Send message
        m.send(mail);
    }


    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class Mail {
        private MailAddress address;
        private MailBody mailBody;

        public Mail(MailAddress address, MailBody mailBody) {
            this.address = address;
            this.mailBody = mailBody;
        }
    }

    private class MailBody {
        String subject;
        MailMessage message;

        public MailBody(String subject, MailMessage message) {
            this.subject = subject;
            this.message = message;
        }
    }

    private class MailAddress {
        private String mId;

        public MailAddress(String firstName, String lastName,
                           String division) {
            this.mId = firstName.charAt(0) + "." + lastName.substring(0, 7) + "@"
                    + division.substring(0, 5) + ".compa.ny";
        }
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(Mail mail) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}