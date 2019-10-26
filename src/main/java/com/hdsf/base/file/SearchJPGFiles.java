package com.hdsf.base.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

/**
 * 递归寻找某目录下 符合条件的所有文件
 */
class Search implements FileVisitor {

	private final PathMatcher matcher;

	public Search(String ext) {
		matcher = FileSystems.getDefault().getPathMatcher("glob:" + ext);
	}

	public void judgeFile(Path file) throws IOException {
		Path name = file.getFileName();
		if (name != null && matcher.matches(name)) {
			System.out.println("Searched file was found: " + name + " in " + file.toRealPath().toString());
		}
	}

	/**
	 * 访问目录后调用
	 * @param dir
	 * @param exc
	 * @return
	 * @throws IOException
	 */
	@Override
	public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
		System.out.println("Visited: " + (Path) dir);
		return FileVisitResult.CONTINUE;
	}

	/**
	 * 访问目录前调用
	 * @param dir
	 * @param attrs
	 * @return
	 * @throws IOException
	 */
	@Override
	public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	/**
	 * 访问文件时调用
	 * @param file
	 * @param attrs
	 * @return
	 * @throws IOException
	 */
	@Override
	public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
		judgeFile((Path) file);
		return FileVisitResult.CONTINUE;
	}

	/**
	 * 访问文件失败后调用
	 * @param file
	 * @param exc
	 * @return
	 * @throws IOException
	 */
	@Override
	public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
		// report an error if necessary
		return FileVisitResult.CONTINUE;
	}
}
//����ĳһ��Ŀ¼�����е�jpg�ļ����������ļ���
public class SearchJPGFiles {

	public static void main(String[] args) throws IOException {
		String ext = "*.jpg";
		Path fileTree = Paths.get("./");
		Search walk = new Search(ext);
		EnumSet<FileVisitOption> opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
		Path path = Files.walkFileTree(fileTree, opts, Integer.MAX_VALUE, walk);

	}
}
