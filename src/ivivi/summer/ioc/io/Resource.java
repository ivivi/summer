package ivivi.summer.ioc.io;

import java.io.File;

public interface Resource {
	
	public boolean isExists();
	public boolean isOpen();
	public File getFile();
	
}
