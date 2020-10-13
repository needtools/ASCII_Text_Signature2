package signature

import java.io.File
import java.util.*

class Roman {
    var width:Int=0
    var line1:String=""
    var line2:String=""
    var line3:String=""
    var line4:String=""
    var line5:String=""
    var line6:String=""
    var line7:String=""
    var line8:String=""
    var line9:String=""
    var line10:String=""
}

fun main() {
    val scannerInput= Scanner(System.`in`)
    val name = scannerInput.nextLine()
    val prof = scannerInput.nextLine().toUpperCase()
//    val fontRoman = Scanner(File("E:/projects/Kotlin/roman.txt"))

    val mapRoman = mutableMapOf<Char, Roman>()
    var nameLine1=""
    var nameLine2=""
    var nameLine3=""
    var nameLine4=""
    var nameLine5=""
    var nameLine6=""
    var nameLine7=""
    var nameLine8=""
    var nameLine9=""
    var nameLine10=""
    var nameLineWidth=0
for(ii in name) {// a s d
    if(ii.isLetter()){
        readFileLineByLineUsingForEachLine("E:/projects/Kotlin/roman.txt", ii, mapRoman )
    }
}

    for(ii in name) {
        nameLine1 += if(ii!=' ') mapRoman[ii]?.line1 else "          "
        nameLine2 += if(ii!=' ') mapRoman[ii]?.line2 else "          "
        nameLine3 += if(ii!=' ') mapRoman[ii]?.line3 else "          "
        nameLine4 += if(ii!=' ') mapRoman[ii]?.line4 else "          "
        nameLine5 += if(ii!=' ') mapRoman[ii]?.line5 else "          "
        nameLine6 += if(ii!=' ') mapRoman[ii]?.line6 else "          "
        nameLine7 += if(ii!=' ') mapRoman[ii]?.line7 else "          "
        nameLine8 += if(ii!=' ') mapRoman[ii]?.line8 else "          "
        nameLine9 += if(ii!=' ') mapRoman[ii]?.line9 else "          "
        nameLine10 += if(ii!=' ') mapRoman[ii]?.line10 else "          "
        nameLineWidth += if(ii!=' ') (mapRoman[ii]?.width ?: 0) else 10

    }

    var profLine1 =""
    var profLine2 = ""
    var profLine3 = ""
    val middleS = "     "
    var strWhole=""
    val a = arrayOf("____", "|__|", "|  |")
    val b = arrayOf("___ ", "|__]", "|__]")
    val c = arrayOf("____", "|   ", "|___")
    val d = arrayOf("___ ", "|  \\", "|__/")
    val e = arrayOf("____", "|___", "|___")
    val f = arrayOf("____", "|___", "|   ")
    val g = arrayOf("____", "| __", "|__]")
    val h = arrayOf("_  _", "|__|", "|  |")
    val i = arrayOf("_", "|", "|")
    val j = arrayOf(" _", " |", "_|")
    val k = arrayOf("_  _", "|_/ ", "| \\_")
    val l = arrayOf("_   ", "|   ", "|___")
    val m = arrayOf("_  _", "|\\/|", "|  |")
    val n = arrayOf("_  _", "|\\ |", "| \\|")
    val o = arrayOf("____", "|  |", "|__|")
    val p = arrayOf("___ ", "|__]", "|   ")
    val q = arrayOf("____", "|  |", "|_\\|")
    val r = arrayOf("____", "|__/", "|  \\")
    val s = arrayOf("____", "[__ ", "___]")
    val t = arrayOf("___", " | ", " | ")
    val u = arrayOf("_  _", "|  |", "|__|")
    val v = arrayOf("_  _", "|  |", " \\/ ")
    val w = arrayOf("_ _ _", "| | |", "|_|_|")
    val x = arrayOf("_  _", " \\/ ", "_/\\_")
    val y = arrayOf("_   _", " \\_/ ", "  |  ")
    val z = arrayOf("___ ", "  / ", " /__")

    for(jj in 0..2) {
        for (element in prof) {
            when (element) {
                'A' -> strWhole += a[jj] + " "
                'B' -> strWhole += b[jj] + " "
                'C' -> strWhole += c[jj] + " "
                'D' -> strWhole += d[jj] + " "
                'E' -> strWhole += e[jj] + " "
                'F' -> strWhole += f[jj] + " "
                'G' -> strWhole += g[jj] + " "
                'H' -> strWhole += h[jj] + " "
                'I' -> strWhole += i[jj] + " "
                'J' -> strWhole += j[jj] + " "
                'K' -> strWhole += k[jj] + " "
                'L' -> strWhole += l[jj] + " "
                'M' -> strWhole += m[jj] + " "
                'N' -> strWhole += n[jj] + " "
                'O' -> strWhole += o[jj] + " "
                'P' -> strWhole += p[jj] + " "
                'Q' -> strWhole += q[jj] + " "
                'R' -> strWhole += r[jj] + " "
                'S' -> strWhole += s[jj] + " "
                'T' -> strWhole += t[jj] + " "
                'U' -> strWhole += u[jj] + " "
                'V' -> strWhole += v[jj] + " "
                'W' -> strWhole += w[jj] + " "
                'X' -> strWhole += x[jj] + " "
                'Y' -> strWhole += y[jj] + " "
                'Z' -> strWhole += z[jj] + " "
                ' ' -> strWhole += middleS
            }
        }
        when(jj){
            0-> profLine1 = strWhole/*.dropLast(1)*/
            1-> profLine2 = strWhole/*.dropLast(1)*/
            2-> profLine3 = strWhole/*.dropLast(1)*/
        }
        strWhole=""
    }

    var otsName =0
    var otsProf =0
    val topLine: String
    if(profLine1.length>nameLineWidth){
        topLine= "8".repeat(profLine1.length)
        otsName= (profLine1.length-nameLineWidth)/2
    }
    else {
        topLine="8".repeat(nameLineWidth)
        otsProf= (nameLineWidth-profLine1.length)/2
    }
    profLine1=" ".repeat(otsProf)+profLine1+" ".repeat(otsProf)
    while(profLine1.length<topLine.length)profLine1+=" "
    profLine2=" ".repeat(otsProf)+profLine2+" ".repeat(otsProf)
    while(profLine2.length<topLine.length)profLine2+=" "
    profLine3=" ".repeat(otsProf)+profLine3+" ".repeat(otsProf)
    while(profLine3.length<topLine.length)profLine3+=" "

    nameLine1=" ".repeat(otsName)+nameLine1+" ".repeat(otsName)
    while(nameLine1.length<topLine.length)nameLine1+=" "
    nameLine2=" ".repeat(otsName)+nameLine2+" ".repeat(otsName)
    while(nameLine2.length<topLine.length)nameLine2+=" "
    nameLine3=" ".repeat(otsName)+nameLine3+" ".repeat(otsName)
    while(nameLine3.length<topLine.length)nameLine3+=" "
    nameLine4=" ".repeat(otsName)+nameLine4+" ".repeat(otsName)
    while(nameLine4.length<topLine.length)nameLine4+=" "
    nameLine5=" ".repeat(otsName)+nameLine5+" ".repeat(otsName)
    while(nameLine5.length<topLine.length)nameLine5+=" "
    nameLine6=" ".repeat(otsName)+nameLine6+" ".repeat(otsName)
    while(nameLine6.length<topLine.length)nameLine6+=" "
    nameLine7=" ".repeat(otsName)+nameLine7+" ".repeat(otsName)
    while(nameLine7.length<topLine.length)nameLine7+=" "
    nameLine8=" ".repeat(otsName)+nameLine8+" ".repeat(otsName)
    while(nameLine8.length<topLine.length)nameLine8+=" "
    nameLine9=" ".repeat(otsName)+nameLine9+" ".repeat(otsName)
    while(nameLine9.length<topLine.length)nameLine9+=" "
    nameLine10=" ".repeat(otsName)+nameLine10+" ".repeat(otsName)
    while(nameLine10.length<topLine.length)nameLine10+=" "


    println("8888"+topLine+"8888")
    println("88  $nameLine1  88")
    println("88  $nameLine2  88")
    println("88  $nameLine3  88")
    println("88  $nameLine4  88")
    println("88  $nameLine5  88")
    println("88  $nameLine6  88")
    println("88  $nameLine7  88")
    println("88  $nameLine8  88")
    println("88  $nameLine9  88")
    println("88  $nameLine10  88")
    println("88  $profLine1  88")
    println("88  $profLine2  88")
    println("88  $profLine3  88")
    println("8888"+topLine+"8888")

}

// +++++++++++++++++++++++++++++++++++++++++
fun readFileLineByLineUsingForEachLine(fileName: String, ii: Char, mapRoman: MutableMap<Char, Roman>) {
    val file = File(fileName)
    var countLine=0
    val bl = Roman()
    var blWidth=0
    val listPos = mutableListOf<Int>()// positions in roman.txt of my key letters => a s d =>1 42 18
            file.forEachLine {
                if(it.length<=4) {// a 10
                val letterStr = it.split(" ")
                    if(letterStr[0].toCharArray()[0]==ii) {// a == a
                            listPos.add(countLine)
                        blWidth=letterStr[1].toInt()
                    }
                }
                countLine++
            }
    countLine=0
    for(cc in listPos){
        file.forEachLine {
            when(countLine){
                cc+1->bl.line1=it
                cc+2->bl.line2=it
                cc+3->bl.line3=it
                cc+4->bl.line4=it
                cc+5->bl.line5=it
                cc+6->bl.line6=it
                cc+7->bl.line7=it
                cc+8->bl.line8=it
                cc+9->bl.line9=it
                cc+10->bl.line10=it
            }
            countLine++
        }
    }
    bl.width=blWidth
    mapRoman[ii] = bl// each symbol only ones
    }