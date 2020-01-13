import java.net.InetAddress;
import java.util.Scanner;
public class Main {
    /**
     * IPSE pro (IPQA)
     */
    public static void main(String[] args) throws Exception {
        InetAddress Netip = InetAddress.getLocalHost();
        Scanner keyIn = new Scanner(System.in);
        System.out.println("  ___                   ___ ____   ___      _");
        System.out.println(" / _ \\ _ __   ___ _ __ |_ _|  _ \\ / _ \\    / \\");
        System.out.println("| | | | '_ \\ / _ \\ '_ \\ | || |_) | | | |  / _ \\");
        System.out.println("| |_| | |_) |  __/ | | || ||  __/| |_| | / ___ \\");
        System.out.println(" \\___/| .__/ \\___|_| |_|___|_|    \\__\\_\\/_/   \\_\\");
        System.out.println("------|_|-----------v0.7(beta)----------------------");
        System.out.println("====================================================");
        System.out.println("");
        while (true) {
            System.out.print(">>> ");

            String command = keyIn.nextLine();
            if ("quit".equals(command)) {
                System.out.println("[*]Rember WITIWIG!");
                break;
            } else if ("exit".equals(command)) {
                System.out.print("错误: 更正 'exit' 为 'quit' [Y/n]");
                String y = keyIn.nextLine();
                if ("".equals(y) || "y".equals(y) || "Y".equals(y)) {
                    break;
                } else {}
            } else if ("scan".equals(command)) {
                System.out.print("scan > ");
                String addr = keyIn.nextLine();
                try {
                    InetAddress[] jasicIP = InetAddress.getAllByName(addr);
                    for (InetAddress address : jasicIP) {
                        System.out.println(address);
                    }
                } catch (Exception unkownaddr) {
                    System.out.println("错误: " + addr + "不是一个有效的域名!");
                }
                
            } else if ("version".equals(command)) {
                System.out.println("");
                System.out.println("    OpenIpsa v0.7(beta) - oss v2.1");
                System.out.println("    Copyright (C) 2015-2019 Atomic computer technology");
                System.out.println("    Copyright (C) 2015-2019 Server Enginx ALPAN");
                System.out.println("");
                System.out.println("    本程序可以在GNU一般公众许可条款下自由分发");
                System.out.println("");
            } else if ("help".equals(command)) {
                System.out.println("用法: scan [...]");
                System.out.println("操作: ");
                System.out.println("    {version}  查看版本");
                System.out.println("");
            } else if ("".equals(command)) {
                System.out.println("错误: 没有指定操作(使用 help 获取帮助)");
            } else {
                System.out.println("错误: 未知命令: " + command);
            }
        }
    }

}
