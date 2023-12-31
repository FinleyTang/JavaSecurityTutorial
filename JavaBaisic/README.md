
## Java基础
### 文件读写关键点

使用Java操作文件系统，那么首先要学习的就是文件的表示，即File类。然后，我们要操作做文件，虽然我们大部分操作都是操作文件系统，但是要明白IO流的概念不仅仅局限在操作文件上，前面我已经提到了，我们的编程语言是要能操作所有的输入输出，因此，API提供了两个顶层抽象类，用来表示操作所有的输出输出：InputStream，OutputStream。并且，这两个类表示字节的输入输出，因为输入输出的本质是字节流。这里注意体会一句话“字节流是最最基本的流”，这句话的由来就是因为计算机底层传递的就是字节。那么，当我们要操作文件的时候，就需要具体的对文件系统操作的IO实现类，于是我们需要学习FileInputStream和FileOutputStream，它们是文件输入输出字节流。这里之所以FileInputStream/OutputStream作为子类出现，按照面向对象思想理解就是，将来还有别的字节流来操作别的设备


不带缓冲区的流对象，只能一个字节一个字节的读，每次都调用底层的操作系统API，非常低效，而带缓冲区的流对象，可以一次读一个缓冲区，缓冲区空了才去调用一次底层API，这就能大大提高效率。所以又有了BufferedInputStream和BufferedOutputSteam

他们的用法是把字节流对象传入后再使用，也相当于把它俩套在了字节流的外面，给字节流装了个“外挂”，让基本字节流如虎添翼。