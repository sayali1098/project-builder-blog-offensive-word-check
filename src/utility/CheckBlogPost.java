package utility;

import model.Blog;


 
public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface{
	String [] offensive = {"anal","analprobe","anilingus","anus","apeshit","ar5e","areola","arian", "bitch", "bitch tit", "bitch tit","bitchass", "bitched", "bitcher", "bitchers",
			"bitches","bitchin","bitching","bitchtits","bloody","blow job" ,"blumpkin","bod","bodily","boink"};

    public boolean checkBlogTitle(Blog blog) {
		String title = blog.getBlogTitle();
		for(int i=0; i<offensive.length;i++) {
			if(title.contains(offensive[i]))
				return false;
		}
		return true;
	}

	
	public boolean checkBlogDescription(Blog blog) {
			String description = blog.getBlogDescription();
			for(int i=0; i<offensive.length;i++) {
				if(description.contains(offensive[i]))
					return false;
			}
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
	if(checkBlogTitle(blog)&& checkBlogDescription(blog)) 
		return true;
	else
		return false;
	}

}
