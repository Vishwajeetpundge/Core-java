package vishu_01;

interface MediaPlayer 
{
	public abstract void play();
	public abstract void stop();
}
interface AdvancedmediaPlayer extends MediaPlayer 
{
	public abstract void pause();

}

class MusicPlayer implements AdvancedmediaPlayer
{
	private String title;
	
	public MusicPlayer(String title)
	{
		if(title!=null && title!="")
		{
		this.title=title;
		}
		else
		{
			System.out.println("Title is not be empty string");
		}
	}
	public void pause()
	{
		System.out.println("Media Pausing:"+title);
	}
	
	public void play()
	{
		System.out.println("Media Started playing:"+title);
	}
	

	public void stop()
	{
		System.out.println("Media Stopped:"+title);
	}
	
	public String getTitle()
	{
		return this.title;
	}
}
class VideoPlayer implements  AdvancedmediaPlayer
{
	private String title;
	public VideoPlayer(String title)
	{
		if(title!=null && title!="")
		{
		this.title=title;
		}
		else
		{
			System.out.println("Title is not be empty string");
		}
	}
		
	public void play()
	{
		System.out.println("Video Playing Started");
	}
	
	public void pause()
	{
		System.out.println("Video playing Stopped");
	}
	
	public void stop()
	{
		System.out.println("Video Stopped");
	}

	public String getTitle()
	{
		return this.title;
	}
}


public class Main 
{

	public static void main(String[] args)
	{
		MusicPlayer mp3=new MusicPlayer("Life");
		System.out.println("Song Title:"+mp3.getTitle());
		mp3.play();
		mp3.stop();
		mp3.pause();
		
		System.out.println("------------------------------------------------------");

		VideoPlayer HD=new VideoPlayer("Video");
		System.out.println("Song Title:"+HD.getTitle());
		HD.play();
		HD.pause();
		HD.stop();
		

	}

}