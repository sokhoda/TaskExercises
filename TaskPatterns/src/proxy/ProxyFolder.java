package proxy;

public class ProxyFolder implements IFolder {
	private Folder folder;
	private User user;

	public ProxyFolder(User user) {
		this.user = user;
	}

	@Override
	public void doSomeJob() {
		if (user.getLogin().equalsIgnoreCase("qw")
				&& user.getPass().equalsIgnoreCase("1")) {
			folder = new Folder();
			folder.doSomeJob();
		} else {
			System.out.println("Not a good user. Access not allowed.");
		}

	}

}
