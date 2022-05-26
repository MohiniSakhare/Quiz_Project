package com.example.quiz_project

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0

    val tv_option_one : TextView = findViewById(R.id.tv_option_one)
    val tv_option_two : TextView = findViewById(R.id.tv_option_two)
    val tv_option_three : TextView = findViewById(R.id.tv_option_three)
    val tv_option_four : TextView = findViewById(R.id.tv_option_four)
    val tv_question : TextView = findViewById(R.id.tv_question)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mQuestionsList = Constant.getQuentions()

        setQuestion()

       // tv_option_one.setOnClicklistener(this)
       // tv_option_two.setOnClicklistener(this)
       // tv_option_three.setOnClicklistener(this)
       // tv_option_four.setOnClicklistener(this)


        val questionsList = Constant.getQuentions()
        Log.i("Questions Size",  "${questionsList.size}")

          val currentPosition = 1
          val question: Question? = questionsList[currentPosition -1]

       //  progressBar.progress = currentPosition
         //tv_progress.text = "$currentPosition" + "/" + progressBar.max
    }

    private fun setQuestion() {

        mCurrentPosition = 1
        val question: Question? = mQuestionsList!!.get(mCurrentPosition - 1)

        defaultOptionsView()
//
//        progressBar.progress = mCurrentPosition
//        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_question.text = question!!.question

//        tv_option_one.button = question.optionOne

        tv_option_two.text = question.optionTwo

        tv_option_three.text = question.optionThree

        tv_option_four.text = question.optionFour

    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add( 0, tv_option_one)

        options.add(1, tv_option_two)

        options.add( 2, tv_option_three)

        options.add( 3, tv_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,R.drawable.ic_bg
            )
        }
    }
    override fun onClick(v: View?){
        when(v?.id){
            R.id.tv_option_one ->{
                selectedOptionaView(tv_option_one,1)
            }
            R.id.tv_option_two ->{
                selectedOptionaView(tv_option_two,2)
            }
            R.id.tv_option_three ->{
                selectedOptionaView(tv_option_three,3)
            }
            R.id.tv_option_four ->{
                selectedOptionaView(tv_option_four,4)
            }
        }
    }

    private fun selectedOptionaView(tv: TextView, selectedOPtionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOPtionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.typeface = Typeface.DEFAULT
        tv.background = ContextCompat.getDrawable(
            this,R.drawable.selected_option_border_bg
        )
    }
}